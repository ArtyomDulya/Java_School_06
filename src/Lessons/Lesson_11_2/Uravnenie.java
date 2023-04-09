package Lessons.Lesson_11_2;

public class Uravnenie {

    private int param1;
    private int param2;
    private int param3;
    private int param4;

    @Override
    public String toString() {
        return "Uravnenie{" +
                "param1=" + param1 +
                ", param2=" + param2 +
                ", param3=" + param3 +
                ", param4=" + param4 +
                '}';
    }

    private Uravnenie(int param1, int param2, int param3, int param4) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
    }

    public static class Builder {
        private int param1;
        private int param2;
        private int param3;
        private int param4;

         public Builder setparam1(int param){
             this.param1 = param;
             return this;
         }
        public Builder setparam2(int param){
            this.param2 = param;
            return this;
        }
        public Builder setparam3(int param){
            this.param3 = param;
            return this;
        }
        public Builder setparam4(int param){
            this.param4 = param;
            return this;
        }

        public Uravnenie build() {
             return new Uravnenie(param1, param2, param3, param4);
        }
    }

}
