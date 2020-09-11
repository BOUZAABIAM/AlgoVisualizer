let i = 1;

function draw(canvas,table) {
    setTimeout(function() {
        let ctx = canvas.getContext("2d");
        let current = table[i];
        ctx.beginPath();
        ctx.fillStyle = "white";
        ctx.fillRect(0, 0, 1250, 600)
        ctx.fillStyle = "red";
        for (let j = 0; j < current.length; j++) {
            let rect_height = current[j] * ((CANVAS_HEIGHT-2*X)/ARRAY_SIZE);
            let rect_x = X + j * (rect_width + rect_width);
            ctx.fillRect(rect_x, rect_y , rect_width, rect_height);
        }
        i++;
        if (i < table.length) {
            draw(canvas,table);
        }
    }, 10)
}




