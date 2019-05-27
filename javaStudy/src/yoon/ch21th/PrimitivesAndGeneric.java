package yoon.ch21th;

class PrimitivesAndGeneric {
    public static void main(String[] args) {
        Box_G<Integer> iBox = new Box_G<Integer>();
    
        iBox.set(125);
        int num = iBox.get();

        System.out.println(num);
    }
}