package com.example.calculatorcompose


class MathOperations {

    fun calculate(tokens : String) : Double {

        val clear = tokens.replace(" ","")

        val numbers = mutableListOf<Double>()
        val marks = mutableListOf<Char>()

        var temp = ""
        for(c in clear)
        {
            if(c.isDigit() || c == '.')
            {
                if(c == '.')
                {
                    if(!temp.contains('.'))
                    {
                        temp +=c
                    }
                }
                else
                {
                    temp += c

                }
            }
            else
            {
                if(temp.isNotEmpty())
                {
                    numbers.add(temp.toDouble())
                    marks.add(c)
                }
                temp = ""
            }
        }

        if(temp.isNotEmpty())
        {
            numbers.add(temp.toDouble())

        }

        var i = 0
        while (i < marks.size)
        {
            if(marks[i] == 'x' || marks[i] == '/')
            {
                val result = if(marks[i] == 'x') numbers[i] * numbers[i+1]
                            else numbers[i] / numbers[i+1]

                numbers[i] = result
                numbers.removeAt(i+1)
                marks.removeAt(i)
            }
            else
            {
                i++
            }

        }

        var sum = numbers[0]

        for(j in marks.indices)
        {
            if(marks[j] == '+')
            {
                sum = numbers[j] + numbers[j+1]
            }
            else if(marks[j] == '-')
            {
                sum = numbers[j] - numbers[j+1 ]
            }
        }


        for(j in marks.indices)
        {
            if (marks[j] == '%')
            {
                sum = numbers[j]
            }
        }

        marks.forEach {
            println("eleman $it")
        }
         if(marks.isNotEmpty())
        {
            return sum

        }

        else
        {
            return 0.0
        }
    }
}