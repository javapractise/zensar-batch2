
interface MultipleStmt{
	public String Stmt(String msg1,String msg2);
}
public class LambdaExpreMultipleStmts {
	public static void main(String args[]) {
		MultipleStmt ms = (msg1,msg2)->{
			String stmt1 = msg1+" "+msg2;
			String stmt2 = "This is " + stmt1;
			return stmt2;
		};
		System.out.println(ms.Stmt("Multiple","Lambda Expression Statement"));
	}
}


/*
Output:
This is Multiple Lambda Expression Statement
*/