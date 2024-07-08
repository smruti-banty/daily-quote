package com.brs.daily_quote;

import org.springframework.stereotype.Repository;

@Repository
public class DailyQuoteRepository {
    public String[] getQuotes() {
        return new String[] {
                "The only limit to our realization of tomorrow will be our doubts of today.",
                "The best way to predict the future is to create it.",
                "Success is not the key to happiness. Happiness is the key to success.",
                "The only thing we have to fear is fear itself.",
                "Change your thoughts and you change your world.",
                "Strive not to be a success, but rather to be of value.",
                "Happiness is not something ready-made. It comes from your own actions.",
                "We must accept finite disappointment, but never lose infinite hope.",
                "It always seems impossible until it's done.",
                "The mind is everything. What you think you become."
        };
    }
}
