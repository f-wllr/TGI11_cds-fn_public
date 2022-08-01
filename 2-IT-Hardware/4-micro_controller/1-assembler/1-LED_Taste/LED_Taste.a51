
LABEL1:
MOV A, #0x0F
Mov P0, A
jmp LABEL1

wait:
mov R0, #255
mov R1, #255
mov R2, #255
out_outer_loop:
dec R2
outer_loop:
dec R1
inner_loop:
dec R0
cjne R0, #0, inner_loop
mov R0, #255
cjne R1, #0, outer_loop
mov R1, #255
cjne R2, #0, outer_outer_loop
RET

END