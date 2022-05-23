class ChainedException
{
        public static void main(String[] args)
        {
                try
                {
                        Exception ae = new Exception("Exception");
                        ae.initCause(new ArithmeticException("Cause of the ArithmeticException"));
                        throw ae;
                }
                catch (Exception ae)
                {
                        System.out.println(ae);
                        System.out.println(ae.getCause());
                }
                try
                {
                        NumberFormatException ex = new NumberFormatException("NumberFormatException");
                        ex.initCause(new NullPointerException("Cause of the NullPointerException"));
                        throw ex;
                }
                catch(NumberFormatException ex)
                {
                        System.out.println(ex);
                        System.out.println(ex.getCause());
                }
        }
}
