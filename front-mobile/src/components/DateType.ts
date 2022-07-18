export function DateDay(date: string){
    const myData = Date.parse(`${date}`)
    const data = new Date(myData);
    const day = data.getUTCDate();
    return day;
}


export function DateMonth(date: string) {
    const myData = Date.parse(`${date}`)
    const data = new Date(myData);
    var month = null;
    
    switch (data.getMonth()) {
        case 0 : 
            month = "Janeiro"
            break;
        case 1 : 
            month = "Fevereiro"
            break;
        case 2 : 
            month = "Março"
            break;
        case 3 : 
            month = "Abril"
            break;
        case 4 : 
            month = "Maio"
            break;
        case 5 : 
            month = "Junho"
            break;
        case 6 : 
            month = "Julho"
            break;
        case 7 : 
            month = "Agosto"
            break;
        case 8 : 
            month = "Setembro"
            break;
        case 9 : 
            month = "Outubro"
            break;
        case 10 : 
            month = "Novembro"
            break;
        case 11 : 
            month = "Dezembro"
            break;

    }
    return month;
}

export function DateYear(date: string) {
    const myData = Date.parse(`${date}`)
    const data = new Date(myData);
    const year = data.getFullYear();
    return year;
}
  

