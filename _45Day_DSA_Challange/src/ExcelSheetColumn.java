package Mathematical;
public class ExcelSheetColumn {
    public static void main(String[] args) {
        int columnNumber = 702;
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;

            sb.append((char) (rem + 'a'));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
}
