def joinTwoWordsWithSymbol = { symbol, first, second -> first + symbol + second }
println joinTwoWordsWithSymbol('#', 'Hello', 'World') == 'Hello#World'
