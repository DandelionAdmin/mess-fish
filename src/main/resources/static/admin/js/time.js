//  将格式化日期转为时间戳
function timeToTimeStamp(datetime) {
    if(datetime == '') {
        return '';
    }else{
        var day = new Date(datetime)
        var stamp = Date.parse(day);
        return stamp;
    }
}

//  将时间戳转为格式化时间
function timeStampToTime(timestamp) {
    if(timestamp == 0) {
        return "";
    }else{
        var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
        var Y = date.getFullYear();
        var M = date.getMonth()+ 1;
        var D = date.getDate();
        var h = date.getHours();
        var m = date.getMinutes();
        var s = date.getSeconds();
        var datestring = Y + "-";
        if (M < 10) datestring += "0";
        datestring += M + "-";
        if (D < 10) datestring += "0";
        datestring += D + " ";
        if (h < 10) datestring += "0";
        datestring += h + ":";
        if (m < 10) datestring += "0";
        datestring += m + ":";
        if (s < 10) datestring += "0";
        datestring += s;
        return datestring;
    }
}