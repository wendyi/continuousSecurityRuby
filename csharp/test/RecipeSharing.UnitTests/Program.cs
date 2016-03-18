using System;
using System.Reflection;
using NUnitLite;

namespace RecipeSharing.UnitTests
{
	class Program
	{
		public static int Main (string[] args)
		{
			//var result;
			#if DNX451
				return new AutoRun().Execute(args);
				//Console.Write(result);
			#else
				return new AutoRun().Execute(typeof(Program).GetTypeInfo().Assembly, Console.Out, Console.In, args);
				//Console.Out.Out(result);
			#endif
		}

	}
}
