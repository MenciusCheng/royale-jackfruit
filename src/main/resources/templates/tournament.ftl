<!doctype html>
<html lang="zh">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>推荐的免费锦标赛</title>

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
  </style>
</head>
<body>
<div>
  <table class="table">
    <thead>
    <tr>
      <th colspan="6">推荐的免费锦标赛</th>
    </tr>
    <tr>
      <th>标签</th>
      <th>游戏模式</th>
      <th>剩余时间</th>
      <th>当前人数</th>
      <th>人数上限</th>
      <th>房间名称</th>
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
</body>
</html>