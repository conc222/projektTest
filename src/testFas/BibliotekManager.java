package Projekt;

public class BibliotekManager extends Bibliotek {

    Bok bok;

    public void Bok(Bok bok){
        this.bok = bok;
    }

    public void returnItem(int bokISBN, int bokID){
        for(int i=0; i<10; i++){

            int isbn = bok.getBokISBN();
            if(bokISBN == isbn){
                for(int j=0; j<10; j++){
                    int id = bok.getBokID();
                    if(bokID == id){
                        bok.utlånad = false;
                        bok.lånad_av = 0;
                    }

                }
            }

        }
    }

}
