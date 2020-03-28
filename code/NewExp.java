package code;
public class NewExp implements Exp {
 
   public final VariableExp name; 
   public final VariableExp variable;
 
   public NewExp(final VariableExp name,final VariableExp variable){
      this.name = name;
      this.variable = variable;
   }
 
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((variable == null) ? 0 : variable.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      NewExp other = (NewExp) obj;
      if (name == null) {
         if (other.name != null)
            return false;
      } else if (!name.equals(other.name))
         return false;
      if(variable == null) {
         if (other.variable != null)
            return false;
      }else if (!variable.equals(other.name))
         return false;
      return true;
            
   }

}
