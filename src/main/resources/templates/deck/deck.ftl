<!doctype html>
<html lang="zh-CN">

<#include "../common/head.ftl">

<body>
    <div class="container">
        <#include "../common/nav.ftl">

        <form id="searchForm" action="page" method="get">
            <div class="form-group row">
                <div class="col">
                    <input type="text" id="formCodeItem" name="codeItem" class="form-control" placeholder="名称" value="<#if codeItem??>${codeItem}</#if>">
                </div>
                <div class="col">
                    <div class="btn-group btn-group-sm">
                        <button type="button" class="btn btn-secondary" onclick="setCodeItemName('')">全</button>
                        <button type="button" class="btn btn-secondary" onclick="setCodeItemName('球')">球</button>
                        <button type="button" class="btn btn-secondary" onclick="setCodeItemName('炮')">炮</button>
                        <button type="button" class="btn btn-secondary" onclick="setCodeItemName('墓')">墓</button>
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <div class="col">
                    <input type="number" id="formStart" name="start" class="form-control" value="<#if start??>${start}</#if>">
                </div>
                <div class="col">
                    <input type="number" id="formSize" name="size" class="form-control" value="<#if size??>${size}</#if>">
                </div>
                <div class="col">
                    <input type="text" readonly class="form-control" value="共${count}">
                </div>
            </div>
            <div class="form-group row">
                <div class="col">
                    <button type="submit" class="btn btn-primary">search</button>
                </div>
            </div>
        </form>

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
                            alt="Knight"
                            onclick="setCodeItem('${item.cards[0].id}')">
                        <img class="card-img"
                            src="${item.cards[1].iconUrls}"
                            alt="Knight"
                            onclick="setCodeItem('${item.cards[1].id}')">
                        <img class="card-img"
                            src="${item.cards[2].iconUrls}"
                            alt="Knight"
                            onclick="setCodeItem('${item.cards[2].id}')">
                        <img class="card-img"
                            src="${item.cards[3].iconUrls}"
                            alt="Knight"
                            onclick="setCodeItem('${item.cards[3].id}')">
                    </div>
                    <div>
                        <img class="card-img"
                            src="${item.cards[4].iconUrls}"
                            alt="Knight"
                            onclick="setCodeItem('${item.cards[4].id}')">
                        <img class="card-img"
                            src="${item.cards[5].iconUrls}"
                            alt="Knight"
                            onclick="setCodeItem('${item.cards[5].id}')">
                        <img class="card-img"
                            src="${item.cards[6].iconUrls}"
                            alt="Knight"
                            onclick="setCodeItem('${item.cards[6].id}')">
                        <img class="card-img"
                            src="${item.cards[7].iconUrls}"
                            alt="Knight"
                            onclick="setCodeItem('${item.cards[7].id}')">
                    </div>
                </div>
            </div>
            </#list>

        </div>

    </div>

    <script src="/demo/deck.js"></script>
</body>

</html>