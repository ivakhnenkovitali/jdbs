package by._java_SE._6_enum;

public enum AbstractDiscount {
    UNDISCOUNTED{
        @Override
        public double discounter(){
            return 1.0;
        }
    },
    DISCOUNTED{
        @Override
        public double discounter(){
            return 0.9;
        }
    };
    public abstract double discounter();
}
