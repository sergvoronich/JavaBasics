package Homework_9;

public enum ClothesSize {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    int euroSize;

    public String getDescription() {
        return "Взрослый размер";
    }

    ClothesSize(int euroSize) {
        this.euroSize = euroSize;
    }
}
