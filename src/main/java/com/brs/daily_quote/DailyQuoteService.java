package com.brs.daily_quote;

import org.springframework.stereotype.Service;

@Service
public class DailyQuoteService {
    private final DailyQuoteRepository repository;
    
    public DailyQuoteService(DailyQuoteRepository repository) {
        this.repository = repository;
    }

    public String getQuote() {
        var quotes = repository.getQuotes();
        int randomIndex = (int) (Math.floor(Math.random() * quotes.length));
        return quotes[randomIndex];
    }
}
