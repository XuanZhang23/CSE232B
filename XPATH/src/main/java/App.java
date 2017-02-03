import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;
import java.util.*;
/**
 * Created by onion on 1/30/17.
 */
public class App {
    public static void main(String[] args) {
        try {

            ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY");//, 1);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/FM/@name");//, 1);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/FM/@name/..");//, 1);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/FM/@name/../..");//, 1);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/FM/@name/../@name");//, 1);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//PERSONA");//, 36);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/FM/@nam");//, 0);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/@name");//, 0);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//@name");//, 2);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/TITLE/text()");//, 1);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/TITLE/text()/..");//, 1);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//LINE");//, 2596);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/*/./../TITLE/text()");//, 1);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/PERSONAE/PGROUP/PERSONA[text()]");//, 27);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/PERSONAE/PGROUP/PERSONA[text()=text()]");//, 27);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/PERSONAE/PGROUP/PERSONA[text() eq text()]");//, 27);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/PERSONAE/PGROUP/PERSONA[text()==text()]");//, 27);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/PERSONAE/PGROUP/PERSONA[text() is text()]");//, 27);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/PERSONAE/PGROUP/PERSONA[./text() is text()]");//, 27);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/PERSONAE/PGROUP/PERSONA[(./text() is text()) " +
            //        "or not (./text() is text())]");//, 27);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//SPEAKER");//, 1596 / 2);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//SPEECH");//, 1590 / 2);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//LINE/text()");//, 5192 / 2);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//*[@name]");//, 2);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//(ACT,PERSONAE)/TITLE");//, 6);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../TITLE");//, 18);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../*/.././TITLE");//, 18);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[(./TITLE)==(./TITLE)]/*/SPEECH/../TITLE");//, 18);
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[not(./TITLE)==(./TITLE)]/*/SPEECH/../TITLE");//, 0);


            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//(ACT,PERSONAE)/TITLE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../*/.././TITLE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[(./TITLE)==(./TITLE)]/*/SPEECH/../TITLE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[not(./TITLE)==(./TITLE)]/*/SPEECH/../TITLE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[not(./TITLE)==(./TITLE)]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[(./TITLE)==(./TITLE)]/*");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../TITLE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/*/*/..");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[./LINE]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[./TITLE]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/ACT/SCENE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/(ACT,PERSONAE)");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")//actor[@id]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")/actors");

            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")//actors[./actor = ./actor]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")//actors[./actor eq ./actor]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")//actors[./actor == ./actor]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")//actors[./actor is ./actor]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")/*[not singer]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")/*");


            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text2.xml\")//ACT[(.//ACTOR) = (.//ACTOR)]/*");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text2.xml\")//ACT[(.//ACTOR) is (.//ACTOR)]/*");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text2.xml\")//ACT[(../ACTOR) is (.//ACTOR)]/*");//(这个句子是错的，解析不出来)
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text2.xml\")//ACT[(.//ACT1) is (.//ACTOR)]/*");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text2.xml\")//ACT[(.//ACTOR) is (.//ACTOR) and (.//actor)]/*");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text2.xml\")//ACT[(.//ACTOR) is (.//ACTOR) and (.//ACT1)]/*");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text2.xml\")//ACT[(.//ACTOR) is (.//ACTOR) or (.//actor)]/*");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")//actors[.//actor]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text2.xml\")//ACT[not (.//actor)]/*");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text2.xml\")//ACT[not [(.//ACTOR) is (.//ACTOR)]]/*");// wired
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text2.xml\")//ACT[[[(.//ACTOR) is (.//ACTOR)] or [(.//actor)]] and [not [.//actor]]]/*");//写了一个难的，但是不明白为什么通不过
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text2.xml\")//ACT[[(.//ACTOR) is (.//ACTOR)] or [(.//actor)]]] ");//写了一个难的，但是不明白为什么通不过

            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")/*[singer]");

            XPathLexer lexer = new XPathLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            XPathParser parser = new XPathParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.ap();

            //for Visitor
            CustomizedVisitor customizedlVisitor = new CustomizedVisitor();
            LinkedList<Node> results = customizedlVisitor.visit(tree);

            WriteXml writer = new WriteXml();
            writer.getPath("output.xml");
            writer.setNodesToWrite(results);
            writer.createSon();
            System.out.println(results.size());

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }
}