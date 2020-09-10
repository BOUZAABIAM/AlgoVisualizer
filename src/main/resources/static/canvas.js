let i = 1;

function draw(canvas,table) {
    setTimeout(function() {
        let ctx = canvas.getContext("2d");
        let current = table[i];
        ctx.beginPath();
        ctx.fillStyle = "white";
        ctx.fillRect(0, 0, 1250, 600)
        ctx.fillStyle = "red";
        let x = 20;
        for (let j = 0; j < current.length; j++) {
            ctx.rect(x + j * 10, 20, 10, current[j] * 10);
            ctx.fill();
            x += 10;
        }
        i++;
        if (i < table.length) {
            draw(canvas,table);
        }
    }, 1000)
}




