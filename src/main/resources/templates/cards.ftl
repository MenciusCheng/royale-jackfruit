<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>所有卡牌</title>

    <style>
        body, table {
        font-size: 12px;
        }

        table {
        table-layout: fixed;
        empty-cells: show;
        border-collapse: collapse;
        margin: 0 auto;
        }

        td {
        height: 30px;
        }

        .table {
        border: 1px solid #cad9ea;
        color: #666;
        }

        .table th {
        background-repeat: repeat-x;
        height: 30px;
        }

        .table td, .table th {
        border: 1px solid #cad9ea;
        padding: 0 1em 0;
        }

        .small-card {
            width: 55.4px;
            height: 66px;
        }
    </style>
</head>
<body>
    <div>
        <table class="table">
            <thead>
                <tr>
                    <th colspan="6">所有卡牌</th>
                </tr>
                <tr>
                    <th>ID</th>
                    <th>名称</th>
                    <th>最大等级</th>
                    <th>图标</th>
                </tr>
            </thead>
            <tbody>
                <#list cards as item>
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.maxLevel}</td>
                    <td><img src="${item.iconUrls}" class="small-card" /></td>
                </tr>
            </#list>
        </tbody>
    </table>
</div>
</body>
</html>