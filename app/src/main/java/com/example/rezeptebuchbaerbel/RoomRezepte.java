package com.example.rezeptebuchbaerbel;


    public class RoomRezepte{
        public String nameRezepte;
        public String zutaten;
        public String verarbeitung;
        public String sonstiges;

        public RoomRezepte(String nameRezepte, String zutaten, String verarbeitung, String sonstiges){
            super();
            this.nameRezepte = nameRezepte;
            this.zutaten = zutaten;
            this.verarbeitung = verarbeitung;
            this.sonstiges = sonstiges;
        }

        public String getNameRezepte() {
            return nameRezepte;
        }

        public String getZutaten() {
            return zutaten;
        }

        public String getVerarbeitung() {
            return verarbeitung;
        }

        public String getSonstiges() {
            return sonstiges;
        }
    }

