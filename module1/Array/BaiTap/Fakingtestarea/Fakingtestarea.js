
let Array= [],n="";
Array[1]='T';Array[2]='Ô';Array[3]='I';Array[4]=' ';Array[5]='L';Array[6]='À';Array[7]=' ';Array[8]='M';Array[9]='Ộ';Array[10]='T';Array[11]=' ';Array[12]='Đ';Array[13]='Ứ';Array[14]='A';Array[15]=' ';Array[16]='N';Array[17]='G';Array[18]='Ố';Array[19]='C';Array[20]='!';Array[21]='!';Array[22]='!';
function typeTextarea(){
    let t = document.f.txt.value;
    let j = t.length;
    if(j > 0)
    {
        for(let i=1; i<=j; i++)
        {
            n = n + Array[i];
            if(i === 22)
            {
                document.f.txt.value = "";
                n = "";
            }
        }
    }
    document.f.txt.value = n;
    n="";
    setTimeout("typeTextarea()", 1);
}
        