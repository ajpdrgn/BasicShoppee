package com.example.midterms_final;

public class Total {
    int BB_price = 350, BB_count;
    int SO_price = 1950, SO_count;
    int PO_price = 7999, PO_count;
    int SEG_price = 9500, SEG_count;
    int MG_price = 1020, MG_count;
    int BB_Total, SO_Total, PO_Total, SEG_Total, MG_Total, Total;

    public void setBB_count(int BB_count){this.BB_count = BB_count;}

    public void setSO_count(int SO_count){this.SO_count = SO_count;}

    public void setPO_count(int PO_count){this.PO_count = PO_count;}

    public void setSEG_count(int SEG_count){this.SEG_count = SEG_count;}

    public void setMG_count(int MG_count){this.MG_count = MG_count;}

    public String getBB_Total(){
        BB_Total = BB_price*BB_count;
        return Integer.toString(BB_Total);
    }

    public String getPO_Total(){
        PO_Total = PO_price*PO_count;
        return Integer.toString(PO_Total);
    }

    public String getSEG_Total(){
        SEG_Total = SEG_price*SEG_count;
        return Integer.toString(SEG_Total);
    }

    public String getSO_Total(){
        SO_Total = SO_price*SO_count;
        return Integer.toString(SO_Total);
    }

    public String getMG_Total(){
        MG_Total = MG_price*MG_count;
        return Integer.toString(MG_Total);
    }

    public String get_Total(){
        Total = BB_Total+PO_Total+SEG_Total+SO_Total+MG_Total;
        return Integer.toString(Total);
    }


}
