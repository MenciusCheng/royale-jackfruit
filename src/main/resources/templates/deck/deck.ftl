<!doctype html>
<html lang="zh-CN">

<#include "../common/head.ftl">

<body>
    <div class="container">
        <#include "../common/nav.ftl">

        <div class="row">
            <form action="page" method="get">
                <div class="row">
                    <div class="col-4">
                        <input type="text" name="codeItem" class="form-control" placeholder="名称" value="<#if codeItem??>${codeItem}</#if>">
                    </div>
                    <div class="col-3">
                        <input type="number" name="start" class="form-control" placeholder="页" value="<#if start??>${start}</#if>">
                        <label>页10,共${count}</label>
                    </div>
                    <div class="col-1">
                        <button type="submit" class="btn btn-primary">search</button>
                    </div>
                </div>
            </form>
        </div>

        <div class="row">
            <#list decks as item>
            <div class="col-sm-12 col-lg-4">
                <div class="deck-card">
                    <div>
                        ${item.name} <a class="btn btn-primary btn-sm" href="https://link.clashroyale.com/deck/cn?deck=${item.code}" target="_blank" role="button">cp</a>
                    </div>
                    <div>
                        <img class="card-img"
                            src="${item.cards[0].iconUrls}"
                            alt="Knight">
                        <img class="card-img"
                            src="${item.cards[1].iconUrls}"
                            alt="Knight">
                        <img class="card-img"
                            src="${item.cards[2].iconUrls}"
                            alt="Knight">
                        <img class="card-img"
                            src="${item.cards[3].iconUrls}"
                            alt="Knight">
                    </div>
                    <div>
                        <img class="card-img"
                            src="${item.cards[4].iconUrls}"
                            alt="Knight">
                        <img class="card-img"
                            src="${item.cards[5].iconUrls}"
                            alt="Knight">
                        <img class="card-img"
                            src="${item.cards[6].iconUrls}"
                            alt="Knight">
                        <img class="card-img"
                            src="${item.cards[7].iconUrls}"
                            alt="Knight">
                    </div>
                </div>
            </div>
            </#list>

        </div>

    </div>
</body>

</html>