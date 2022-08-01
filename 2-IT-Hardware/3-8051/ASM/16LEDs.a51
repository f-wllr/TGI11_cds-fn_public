


Start:
MOV A, #1   ; Kommentar
CPL A
MOV P0, A	 
ACALL wait

MOV A, #2   ; Kommentar
CPL A
MOV P0, A	 
ACALL wait

MOV A, #4   ; Kommentar
CPL A
MOV P0, A	 
ACALL wait

MOV A, #8   ; Kommentar
CPL A
MOV P0, A	 
ACALL wait

MOV A, #16   ; Kommentar
CPL A
MOV P0, A	 
ACALL wait

MOV A, #32   ; Kommentar
CPL A
MOV P0, A	 
ACALL wait

MOV A, #64   ; Kommentar
CPL A
MOV P0, A	 
ACALL wait

MOV A, #128   ; Kommentar
CPL A
MOV P0, A	 
ACALL wait

jmp Start

wait:
mov R0, #255
mov R1, #255
mov R2, #1
outer_outer_loop:
dec R2
outer_loop:
dec R1
inner_loop:
dec R0
cjne R0,#0, inner_loop
mov R0, #255
cjne R1,#0, outer_loop
mov R1,#255 
cjne R2,#0, outer_outer_loop
RET

End