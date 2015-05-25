import org.w3.banana.{SparqlHttpModule, SparqlOpsModule, RDFOpsModule, RDFModule}

trait SPARQLExampleDependencies
  extends RDFModule
  with RDFOpsModule
  with SparqlOpsModule
  with SparqlHttpModule
