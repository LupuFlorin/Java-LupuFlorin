public class Street {
        private String name;
        private int length;
        Intersection I1;
        Intersection I2;

        public Intersection getI2() {
                return I2;
        }

        public void setI2(Intersection i2) {
                I2 = i2;
        }

        public Intersection getI1() {
                return I1;
        }

        public void setI1(Intersection i1) {
                I1 = i1;
        }

        public int getLength() {
                return length;
        }

        public void setLength(int length) {
                this.length = length;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }
}
