function draw(canvas, table) {
    var ctx = canvas.getContext("2d");
    for (var i = 0; i < table.length; i++) {
        var current = table[i];
        delay(current);
        function delay(i) {
            setTimeout(function () {
                ctx.beginPath();
                ctx.fillStyle = "white";
                ctx.fillRect(0, 0, 1250, 600)
                ctx.fillStyle = "red";
                var x = 20;
                for (var j = 0; j < i.length; j++) {
                    ctx.rect(x + j * 10, 20, 10, i[j] * 10);
                    ctx.fill();
                    x += 10;
                }
            }, 5000);
        }
    }


}

