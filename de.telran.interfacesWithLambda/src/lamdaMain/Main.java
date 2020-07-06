package lamdaMain;


import lambda.ExecLamda;

public class Main {
    public static void main(String[] args) {
        ExecLamda example = new ExecLamda();
        example.NumberInSq(5);
        example.NumberModWord("abcde");
        example.wordUp("ivan");
        example.biLengh("abc", "de");
        example.biSummLengh("abc", "def");
        example.wordRevers("abcdefgh");
        example.namberRevers(12345);
        example.logicalRes(6);
        example.logicalRes(25);
        example.logicalRes("12");
        example.moreX ("12345",4);
        example.dateExec();
        example.randomExec();
        example.stringLo("ABCDE");
        example.sqrtExec(48);
        example.randomExec1();
        example.empAndSal("John",5000);
    }
}
