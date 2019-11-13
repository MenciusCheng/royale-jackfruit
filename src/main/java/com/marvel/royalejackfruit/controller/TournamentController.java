package com.marvel.royalejackfruit.controller;

import com.marvel.royalejackfruit.domain.vo.royaledev.TournamentHeader;
import com.marvel.royalejackfruit.domain.vo.royaledev.TournamentHeaderList;
import com.marvel.royalejackfruit.domain.vo.tournament.TournamentVo;
import com.marvel.royalejackfruit.service.RoyaleDevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marvel on 2019/11/12.
 */
@RestController
@RequestMapping("/api/v1/tournament")
public class TournamentController {

    private final RoyaleDevService royaleDevService;

    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    @Autowired
    public TournamentController(RoyaleDevService royaleDevService) {
        this.royaleDevService = royaleDevService;
    }

    @GetMapping("/recommend")
    public Set<TournamentVo> getRecommendTournaments(@RequestParam(required = false, defaultValue = "30") Integer capacity,
                                                     @RequestParam(required = false, defaultValue = "a") String name) {
        Set<TournamentVo> tourSet = new HashSet<>();
        TournamentHeaderList aList = royaleDevService.searchTournaments(name);
        Set<TournamentHeader> sumList = new HashSet<>();
        sumList.addAll(aList.getItems());

        sumList.stream().filter(it ->
            "inProgress".equals(it.getStatus()) && "open".equals(it.getType()) && it.getCapacity() > capacity && it.getLevelCap() == 9
        ).forEach(it -> {
            String gameMode = toGameMode(it.getGameMode().getId().toString());
            LocalDateTime createdTime = toLocalDateTime(it.getCreatedTime());
            LocalDateTime startTime = createdTime.plusSeconds(it.getPreparationDuration());
            LocalDateTime endTime = startTime.plusSeconds(it.getDuration());
            String remainingTime = timeBetween(System.currentTimeMillis(), endTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());

            TournamentVo t = new TournamentVo();
            t.setGameMode(gameMode);
            t.setTag(it.getTag());
            t.setName(it.getName());
            t.setCapacity(it.getCapacity());
            t.setMaxCapacity(it.getMaxCapacity());
            t.setRemainingTime(remainingTime);

            tourSet.add(t);
        });

        return tourSet;
    }

    private LocalDateTime toLocalDateTime(String time) {
        String ts = time.substring(0, 8) + time.substring(9, 15);
        LocalDateTime localDateTime = LocalDateTime.parse(ts, dtf);
        return localDateTime.plusHours(7);
    }

    private String timeBetween(Long start, Long end) {
        int between = (int)((end - start) / 1000);
        int hour = between / 3600;
        int minute = (between - hour * 3600) / 60;

        StringBuilder sb = new StringBuilder();
        if (hour > 0) {
            sb.append(hour).append("小时");
        }
        if (minute > 0) {
            sb.append(minute).append("分钟");
        }
        return sb.toString();
    }

    private String toGameMode(String gameMode) {
        if ("72000009".equals(gameMode)) {
            return "常规对战";
        } else if ("72000194".equals(gameMode)) {
            return "卡牌三选一模式";
        } else if ("72000027".equals(gameMode)) {
            return "三倍圣水对战";
        } else if ("72000013".equals(gameMode)) {
            return "双倍圣水选卡";
        } else if ("72000005".equals(gameMode)) {
            return "选卡对战";
        }
        return gameMode;
    }
}
