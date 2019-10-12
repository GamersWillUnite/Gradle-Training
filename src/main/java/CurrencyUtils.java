import com.github.sarxos.xchange.ExchangeCache;
import com.github.sarxos.xchange.ExchangeException;
import com.github.sarxos.xchange.ExchangeRate;

import java.math.BigDecimal;

public class CurrencyUtils {

    static BigDecimal toEUR(double pounds) throws ExchangeException {
        ExchangeCache.setParameter("openexchangerates.org.apikey", "fb07b47cf14342c988bd5a460d21b11e");
        ExchangeCache cache = new ExchangeCache("USD");

        ExchangeRate rate = cache.getRate("EUR");

        BigDecimal amountInPounds = new BigDecimal(pounds);

        return rate.convert(amountInPounds);
    }

    static BigDecimal toUSD(double pounds) throws ExchangeException {
        ExchangeCache.setParameter("openexchangerates.org.apikey", "fb07b47cf14342c988bd5a460d21b11e");
        ExchangeCache cache = new ExchangeCache("USD");

        ExchangeRate rate = cache.getRate("GBP");

        BigDecimal amountInPounds = new BigDecimal(pounds);

        return rate.convert(amountInPounds);
    }
}
