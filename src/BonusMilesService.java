public class BonusMilesService {

        public int calculate(int ticketPrice) {
            int milesPerRubles = 20;
            int miles = ticketPrice / milesPerRubles;
            return miles;
        }
    }

