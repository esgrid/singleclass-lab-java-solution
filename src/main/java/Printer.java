public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public void print(int pages, int copies){
        this.sheets -= pages * copies;
        this.toner -= pages * copies;
    }

    public int getSheetsLeft() {
        return this.sheets;
    }

    public int getTonerVolume() {
        return this.toner;
    }

    public boolean checkIfCanPrint(int sheets, int copies) {
        return (sheets * copies <= this.sheets && sheets * copies <= this.toner);
    }
}
