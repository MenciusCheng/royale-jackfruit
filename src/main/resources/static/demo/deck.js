
let codeItemName = {
    "球":"26000006",
    "炮":"27000002",
    "墓":"28000010"
}

function setCodeItemName(name) {
    $('#formCodeItem').val(codeItemName[name])
    $('#searchForm').submit()
}

function setCodeItem(codeItem) {
    $('#formCodeItem').val(codeItem)
}
