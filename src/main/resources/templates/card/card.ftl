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
                            <th scope="col">ID</th>
                            <th scope="col">名称</th>
                            <th scope="col">最大等级</th>
                            <th scope="col">图标</th>
                        </tr>
                    </thead>
                    <tbody>
                        <#list cards as item>
                        <tr>
                            <th>${item.id}</th>
                            <td>${item.name}</td>
                            <td>${item.maxLevel}</td>
                            <td><img class="card-img"
                                    src="${item.iconUrls}"
                                    alt="${item.name}"></td>
                        </tr>
                        </#list>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>

</html>