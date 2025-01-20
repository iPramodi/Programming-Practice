import schemdraw
import schemdraw.elements as elm

with schemdraw.Drawing() as d:
    # Source voltage and input network
    d.add(elm.SourceSin().label('$V_s$', 'left'))
    d.add(elm.Resistor().right().label('$R_{sig}$'))
    d.add(elm.Capacitor().down().label('$C_G$'))
    d.add(elm.Dot())
    d.add(elm.Resistor().down().label('$R_G$', 'right'))
    d.add(elm.Ground())

    # Gate of the MOSFET
    gate = d.add(elm.Dot(open=True).right().at(d.here))
    d.add(elm.Capacitor().down().label('$C_{gs}$', 'left'))
    d.add(elm.Ground())

    # Connecting to the drain
    drain = d.add(elm.Line().up().at(gate.end).length(1))
    d.add(elm.Capacitor().right().label('$C_{gd}$'))
    d.add(elm.Line().right().length(1))

    # MOSFET current source model
    d.add(elm.CurrentLabel(line='i', ofst=0.4, label='$g_m v_{gs}$', loc='end').at(gate.end))

    # Drain load and output
    d.add(elm.Resistor().up().label('$R_D$', 'left'))
    d.add(elm.Line().up().length(0.5))
    d.add(elm.Dot(open=True).label('$V_{DD}$', 'right'))

    # Output coupling capacitor and load network
    d.add(elm.Capacitor().right().at(drain.end).label('$C_C$', 'right'))
    d.add(elm.Dot())
    d.add(elm.Capacitor().down().label('$C_{Wo}$', 'right'))
    d.add(elm.Resistor().down().label('$R_L$', 'right'))
    d.add(elm.Ground())

    # Draw the circuit
    d.draw()
