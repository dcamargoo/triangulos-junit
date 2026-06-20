package pack;

public class Triangulo {

    public Triangulo(){}

    public boolean podeSerTriangulo(int l1, int l2, int l3){
        return (l1 > 0 && l2 > 0 && l3 > 0) &&
                (l1 < l2+l3) &&
                (l2 < l1+l3) &&
                (l3 < l1+l2) &&
                (Math.abs(l2-l3) < l1) &&
                (Math.abs(l1-l3) < l2) &&
                (Math.abs(l1-l2) < l3);
    }

    public boolean eEquilatero(int l1, int l2, int l3) {
        return (podeSerTriangulo(l1, l2, l3) && l1 == l2 && l2 == l3);
    }

    public boolean eIsosceles(int l1, int l2, int l3) {
        return (podeSerTriangulo(l1, l2, l3) &&
                ((l1 == l2 && l2 != l3) ||
                (l1 == l3 && l3 != l2) ||
                (l2 == l3 && l3 != l1)));
    }

    public boolean eEscaleno(int l1, int l2, int l3) {
        return (podeSerTriangulo(l1, l2, l3) && l1 != l2 && l1 != l3 && l2 != l3);
    }

    public String classificar(int l1, int l2, int l3){
        if (eEquilatero(l1, l2, l3)) return "Equilatero";
        else if (eIsosceles(l1, l2, l3)) return "Isosceles";
        else if (eEscaleno(l1, l2, l3)) return "Escaleno";
        return "Não pode ser um triângulo!";
    }

}
