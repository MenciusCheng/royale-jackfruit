<!doctype html>
<html lang="zh-CN">

<#include "../common/head.ftl">

<body>
    <div class="container">
        <#include "../common/nav.ftl">

        <div class="row">
            <div class="col-12">
                <table class="table table-dark">
                    <thead>
                        <tr>
                            <th scope="col">标签</th>
                            <th scope="col">游戏模式</th>
                            <th scope="col">剩余时间</th>
                            <th scope="col">当前人数</th>
                            <th scope="col">人数上限</th>
                            <th scope="col">房间名称</th>
                        </tr>
                    </thead>
                    <tbody>
                        <#list tournaments as item>
                        <tr>
                            <td>${item.tag}</td>
                            <td>${item.gameMode}</td>
                            <td>${item.remainingTime}</td>
                            <td>${item.capacity}</td>
                            <td>${item.maxCapacity}</td>
                            <td>${item.name}</td>
                        </tr>
                        </#list>
                        <tr>
                            <td colspan="6"><strong>备注：</strong>剩余时间可能会有一个小时的误差。</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>

</html>