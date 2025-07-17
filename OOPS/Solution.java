

class Solution {
    int real;
    int img;

    public Solution(int r, int i) {
        real = r;
        img = i;

    }
    
    public static Solution add(Solution a, Solution b) {
        return new Solution((a.real + b.real), (a.img + b.img));

    }

    public static Solution diff(Solution a, Solution b) {
        return new Solution((a.real - b.real), (a.img - b.img));
    }
    
    public static Solution prod(Solution a, Solution b) {
        return new Solution((a.real * b.real), (a.img * b.img));
    }

    public void PrintComplex() {
        if (real == 0 && img != 0) {
            System.out.println(img +"i");
        }
        else if (img == 0 && real != 0) {
            System.out.println(real);
        }
        else {
            System.out.println(real + "+" + img + "i");
        }
    }
}

class solution {
    public static void main(String[] args) {
        Solution c = new Solution(4, 5);
        Solution d = new Solution(9, 4);

        Solution e = Solution.add(c, d);
        Solution f = Solution.diff(c, d);
        Solution g = Solution.prod(c, d);

        e.PrintComplex();
        f.PrintComplex();
        g.PrintComplex();
    }
}