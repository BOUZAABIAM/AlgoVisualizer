function draw(canvas,table){
    var ctx = canvas.getContext("2d");
    ctx.beginPath();
    ctx.fillStyle = "red";
    var x = 20;
    for(var i=0;i<table.length;i++){

        ctx.rect(x+i*10, 20, 10, table[i]*10);
        ctx.fill();
        x+=10;
    }

}
