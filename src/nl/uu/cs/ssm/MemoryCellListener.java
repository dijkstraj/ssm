/**
 * Simple Stack Machine
 *
 * Written by Atze Dijkstra, atze@cs.uu.nl,
 * Copyright Utrecht University.
 *
 */

package nl.uu.cs.ssm ;

import java.util.EventListener;

public interface MemoryCellListener extends EventListener
{
    public void cellChanged( MemoryCellEvent e ) ;
}