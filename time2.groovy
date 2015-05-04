import org.codehaus.groovy.runtime.TimeCategory
import static java.util.Calendar.*
use (TimeCategory) {
  eight_days_time = 1.week.from.now + 1.day
}
println eight_days_time[DAY_OF_MONTH]
println eight_days_time.format('d')  // alternative to above
println eight_days_time[DAY_OF_YEAR]
println eight_days_time.format('MMMM')
println eight_days_time.format('EEEE')