package InterestCalculator;

public class InterestCalc 
{
    
    public static float interestCalcPerMonth(float P, float R)
    {
        float I = (P * R)/100;
        I = I / 12;
        return I;
    }
    
    public static float reducingPrincipal(float interest)
    {
        float EMI = 55000f;
        float reducedEMI = EMI - interest;
        return reducedEMI;
    }
    
    public static float EffectivePrincipal(float currentPrincipal, float EffRed)
    {
        float EffectiveValue = currentPrincipal - EffRed;
        return EffectiveValue;
    }
    
    public static void main(String[] args) 
    {
        //Defining Principal
        float Principal = 1150000;
        int months = 0;

        //Till Prtincipal Becmoes Zero
        while(Principal > 0)
        {
            //CalculateInterestMonth
            float interestPerMon = interestCalcPerMonth(Principal,8.5f);
            System.out.println("Interest Per Month = "+interestPerMon);
            
            //Reduced EMI
            float reducedEmi = reducingPrincipal(interestPerMon);
            System.out.println("Effective Reduction = "+reducedEmi);
            
            //Reduction In Princiapal Per Month
            float EffectiveValue = EffectivePrincipal(Principal,reducedEmi);
            Principal = EffectiveValue;
            System.out.println("Remaining Principal= "+Principal);
            System.out.println();

            months = months + 1;
        }

        System.out.println("Total Months = "+months);
    }
}