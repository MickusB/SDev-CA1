
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object store extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
	"""),format.raw/*4.2*/("""<script src=""""),_display_(/*4.16*/routes/*4.22*/.Assets.versioned("javascripts/jquery-3.2.1.slim.js")),format.raw/*4.75*/(""""></script>
	<script type="text/javascript">  
        $(document).ready(function () """),format.raw/*6.39*/("""{"""),format.raw/*6.40*/("""  
            """),format.raw/*7.13*/("""$('.dropdown-toggle').dropdown();  
        """),format.raw/*8.9*/("""}"""),format.raw/*8.10*/(""");  
   </script> 
""")))};
Seq[Any](format.raw/*1.4*/(""" """),format.raw/*1.5*/("""<!Wayne Carruth X00138115 Michael Brady X0013103 Kevin Hoang x00137044>

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/main("Game Commodities : Cart", scripts)/*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 21 09:52:42 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDevCA1/play-java-seed/app/views/store.scala.html
                  HASH: 62bfc7ca968ba219d13229d1b1a0613cdaec698e
                  MATRIX: 941->1|1021->80|1035->87|1115->91|1144->94|1184->108|1198->114|1271->167|1385->254|1413->255|1456->271|1527->316|1555->317|1615->3|1642->4|1744->339|1775->344|1824->384|1864->386
                  LINES: 28->1|32->3|32->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|38->7|39->8|39->8|42->1|42->1|44->10|46->12|46->12|46->12
                  -- GENERATED --
              */
          