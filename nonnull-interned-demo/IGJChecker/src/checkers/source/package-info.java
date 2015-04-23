/**
 * Contains the essential functionality for interfacing a compile-time (source) 
 * typechecker plug-in to the Java compiler. This allows a typechecker to use 
 * the compiler's error reporting mechanism and to access abstract syntax trees
 * and compiler utility classes.
 * 
 * <p>
 * 
 * Most classes won't want to extend the classes in this package directly; the
 * classes in the {@link checkers.basetype} package provide additional
 * functionality.
 *
 * @see checkers.basetype 
 * @manual #writing-a-checker Writing a Checker
 */
package checkers.source;

