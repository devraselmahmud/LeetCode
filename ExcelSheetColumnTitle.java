public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        if(columnNumber < 27){
            return Character.toString((char) ('A' + (columnNumber - 1) % 26));
        }
        StringBuilder ch = new StringBuilder();
        while(columnNumber > 0){
            if(columnNumber % 26 == 0){ //check columnNumber is multiple by 26
                ch.append((char) ('A' + 25));
                columnNumber = columnNumber - 1; // decreasing 1
            }
            else{
                ch.append((char) ('A' + columnNumber % 26 - 1));
            }
            columnNumber = columnNumber / 26; // divide remainder by 26
        }
        return ch.reverse().toString();
    }  
}
