import { Link } from "react-router-dom";
import { useAppContext } from "../contexts/AppContext";
import SignOutButton from "./SignOutButton";
import logo from "../assets/logo1.png";


const Header = () => {
  const { isLoggedIn } = useAppContext();

  return (
    <div className="bg-gray-900 py-6">
      <div className="container mx-auto flex justify-between">
        <span className="text-3xl text-white font-bold tracking-tight">
          
          
        <Link to="/" className="flex items-center text-white no-underline">
      <img src={logo} alt="TravelNest Logo" className=" h-4 me-2" />
      TravelNest
    </Link>

        </span>
        <span className="flex space-x-2">
          {isLoggedIn ? (
            <>
              <Link
                className="flex items-center text-white px-3 font-bold hover:bg-gray-600"
                to="/my-bookings"
              >
                My Bookings
              </Link>
              <Link
                className="flex items-center text-white px-3 font-bold hover:bg-gray-600"
                to="/my-hotels"
              >
                My Hotels
              </Link>
              <SignOutButton />
            </>
          ) : (
            <Link
              to="/sign-in"
              className="flex bg-white items-center text-gray-600 px-3 font-bold hover:bg-blue-s-100"
            >
              Sign In
            </Link>
          )}
        </span>
      </div>
    </div>
  );
};

export default Header;
// import { Link } from "react-router-dom";
// import { useAppContext } from "../contexts/AppContext";
// import SignOutButton from "./SignOutButton";

// // Import your logo image

// const Header = () => {
//   const { isLoggedIn } = useAppContext();

//   return (
//     <header className="bg-white dark:bg-gray-900">
//       <div className="mx-auto w-full max-w-screen-xl p-4 py-6 lg:py-8">
//         <div className="md:flex md:justify-between">
//           <div className="mb-6 md:mb-0">
//             {/* Your logo and branding */}
            
//               <h1>
//               <span className="self-center text-2xl font-semibold whitespace-nowrap dark:text-white">Travel Nest</span></h1>
//             </Link>
//           </div>
//           <div className="hidden md:block grid grid-cols-2 gap-8 sm:gap-6 sm:grid-cols-3">
//             {/* Your navigation links */}
//             {isLoggedIn ? (
//               <>
//                 <Link
//                   className="flex items-center text-gray-500 hover:text-gray-900 dark:hover:text-white px-3 font-bold hover:bg-gray-100"
//                   to="/my-bookings"
//                 >
//                   My Bookings
//                 </Link>
//                 <Link
//                   className="flex items-center text-gray-500 hover:text-gray-900 dark:hover:text-white px-3 font-bold hover:bg-gray-100"
//                   to="/my-hotels"
//                 >
//                   My Hotels
//                 </Link>
//                 <SignOutButton />
//               </>
//             ) : (
//               <Link
//                 to="/sign-in"
//                 className="flex bg-white items-center text-gray-900 px-3 font-bold hover:bg-gray-100"
//               >
//                 Sign In
//               </Link>
//             )}
//           </div>
//         </div>
//       </div>
//     </header>
//   );
// };

// export default Header;
