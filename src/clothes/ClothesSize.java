package clothes;

public enum ClothesSize{
    XXS(38),
    XS(40){
        public String getDescription(){
            return"Детский размер";
        }
    },
    S(44),
    M(46),
    L(48);

    private final int  euroSize;

    ClothesSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "Взрослый размер";
    }
    
}
