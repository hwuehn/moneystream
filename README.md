# moneystream
Analyse fix and variable costs, explore potential savings

Accounting is a basic system for companies to depict the financial flow.
Financial flow leads either to capital or owe. Why not use this knowledge for private life. 
Check out my software and optimize your expenditure. 
Keep in mind that every fulfilled wish results in a new one... 

Summarized upcomming features:
-> track your costs, track your revenue
-> analyze potential savings
-> encode your data for portability

GUI-Features:
-> package presentation
-> create class InputFrame
   fields: account, toAccount 
           amount 
           revenue | expenditure
           fix | variable
           date, description
           invoiceNumber
-> create class OutputAccountListFrame
   fields: List<T> moneyFlow //accounting list
-> create class OutputAccount
   method: accountList() -> stream
-> create class DiagramView
   method: showCakeChart() -> stream

Data-Features:
-> package data
-> create class Input
   fields: int account, toAccount 
           double amount 
           enum revenue, expenditure
           enum fix, variable
           LocalDate date, String description
           String invoiceNumber
  ...
