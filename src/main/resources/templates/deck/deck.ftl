<!doctype html>
<html lang="zh-CN">

<#include "../common/head.ftl">

<body>
    <div class="container">
        <#include "../common/nav.ftl">

        <div class="row">
            <#list decks as item>
            <div class="col-sm-12 col-lg-4">
                <div>
                    <div>
                        ${item.name}
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