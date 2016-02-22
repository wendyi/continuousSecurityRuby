//using System;
//using Microsoft.AspNet.Mvc;
//using System.Web;
//
//namespace RecipeSharing
//{
//	public class HomeController : Controller
//	{
//		public ActionResult Index ()
//		{
//			var mvcName = typeof(Controller).Assembly.GetName ();
//			var isMono = Type.GetType ("Mono.Runtime") != null;
//
//			ViewData ["Version"] = mvcName.Version.Major + "." + mvcName.Version.Minor;
//			ViewData ["Runtime"] = isMono ? "Mono" : ".NET";
//
//			return View ();
//		}
//	}
//}

