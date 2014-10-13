import java.util.Calendar;

public class Cal{
    public static void main(String[] args){
        int count,week;
        int i,j;
        
        Calendar cal = Calendar.getInstance();
        
        //曜日を取得
        cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),1);
        week = cal.get(Calendar.DAY_OF_WEEK);
        
        //最終日を取得
        cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH) + 1,0);
        count = cal.get(Calendar.DATE);
        
        //月初めの空白を挿入
        for(i = 1; i < week; i++){
            System.out.print("   ");
        }
        
        
        for(j = 0; j < count; j++){
            System.out.print(String.format("%1$2d ", j+1));
            i++;
            if(i == 8 || j == count - 1){
                System.out.println();
                i = 1;
            }
        }
    }
}
